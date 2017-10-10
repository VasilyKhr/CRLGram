import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        crl_gramLexer lex = new crl_gramLexer(new ANTLRFileStream("C:\\Users\\user\\Documents\\GitHub\\antlrtest\\CRLGram\\output\\__Test___input.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        crl_gramParser g = new crl_gramParser(tokens, 49100, null);
        try {
            g.crl();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}