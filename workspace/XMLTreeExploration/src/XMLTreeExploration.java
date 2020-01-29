import components.simplereader.SimpleReader;
import components.simplereader.SimpleReader1L;
import components.simplewriter.SimpleWriter;
import components.simplewriter.SimpleWriter1L;
import components.xmltree.XMLTree;
import components.xmltree.XMLTree1;

/**
 * Put a short phrase describing the program here.
 *
 * @author Put your name here
 *
 */
public final class XMLTreeExploration {

    /**
     * Private constructor so this utility class cannot be instantiated.
     */
    private XMLTreeExploration() {
    }

    /**
     * Main method.
     *
     * @param args
     *            the command line arguments
     */
    public static void main(String[] args) {
        SimpleReader in = new SimpleReader1L();
        SimpleWriter out = new SimpleWriter1L();
        XMLTree xml = new XMLTree1(
                "http://web.cse.ohio-state.edu/software/2221/web-sw1/"
                        + "extras/instructions/xmltree-model/columbus-weather.xml");

        String s = xml.toString();

        //out.println(s);

        xml.display();

        XMLTree results = xml.child(0);

        //results.display();

        XMLTree channel = results.child(0);

        //channel.display();

        out.println(channel.numberOfChildren());

        XMLTree title = channel.child(1);

        //title.display();

        XMLTree titleText = title.child(0);

        //titleText.display();

        out.println(titleText);
        //one line method(!!bad programming practice!!)
        out.println(xml.child(0).child(0).child(1).child(0));

        XMLTree astronomy = channel.child(10);

        if (astronomy.hasAttribute("sunset")) {
            out.println("Astronomy has attribute sunset!");
            out.println("Astronomy attribute value sunset is "
                    + astronomy.attributeValue("sunset"));

        } else if (!astronomy.hasAttribute("sunset")) {
            out.println("Astronomy does not have attribute sunset!");
        }
        if (astronomy.hasAttribute("midday")) {
            out.println("Astronomy has attribute midday!");
            out.println("Astronomy attribute value midday is "
                    + astronomy.attributeValue("midday"));

        } else if (!astronomy.hasAttribute("midday")) {
            out.println("Astronomy does not have attribute midday!");
        }

        in.close();
        out.close();
    }

}
