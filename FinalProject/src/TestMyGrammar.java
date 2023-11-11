import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.gui.TreeViewer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.awt.Dimension; 
import java.util.Arrays; 
import java.io.IOException;
import javax.swing.*;

//
public class TestMyGrammar {

	//load file content and return it as string
    private static String loadFileAsString(String pathToFile) throws IOException{
        return new String(Files.readAllBytes(Paths.get(pathToFile)));
    }
    //Graphically represent the tree
    private static void visualizeSyntaxTree(ParseTree syntaxTree, MyGrammarParser parser){
    	
        MyFrame displayFrame = createCustomFrame("Visual Representation of Syntax Tree");
        TreeViewer treeVisualizer = new TreeViewer(Arrays.asList(parser.getRuleNames()), syntaxTree);
        treeVisualizer.setScale(.45); //Scale to fit tree fully in view

        JPanel panel = new JPanel();
        panel.add(treeVisualizer);
        
        JScrollPane scrollPane = new JScrollPane(panel); //Allow scrolling across the visual
        displayFrame.add(scrollPane);

        displayFrame.pack(); 
        displayFrame.setLocationRelativeTo(null);
        displayFrame.setVisible(true);
    }

    private static MyFrame createCustomFrame(String title){
        MyFrame customFrame = new MyFrame(title);
        customFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        customFrame.setPreferredSize(new Dimension(1280, 720));
        return customFrame;
    }

    public static void main(String[] args){
        String pathToTestCase = "testcases/project_deliverable_1_testcase.py";
        try {
        	//Test case file loaded as string
            String code = loadFileAsString(pathToTestCase);
            CharStream charStream = CharStreams.fromString(code);
            //Lexer tokenizes input
            MyGrammarLexer lexer = new MyGrammarLexer(charStream);
            CommonTokenStream tokenStream = new CommonTokenStream(lexer);
            MyGrammarParser parser = new MyGrammarParser(tokenStream);
            ParseTree tree = parser.prog(); 
            visualizeSyntaxTree(tree, parser);
        } catch (IOException ioException){
        	//Handle IO exceptions
            ioException.printStackTrace();
            JOptionPane.showMessageDialog(null, " Error loading file: " + ioException.getMessage(),
                                          "File Read  Error", JOptionPane.ERROR_MESSAGE);
        } catch (RecognitionException recognitionException){
            recognitionException.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error parsing file:  " + recognitionException.getMessage(),
                                          "Parse Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    static class MyFrame extends JFrame {
        public MyFrame(String title) {
            super(title);
        }
    }
}
