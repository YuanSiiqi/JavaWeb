import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

/**
 * 作者：ysq
 * 日期: 2020/11/19 15:23
 * 描述:
 */
public class main {
    public static void main(String[] args) {
        try {
            DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            Document document = documentBuilder.parse(main.class.getResourceAsStream("/books.xml"));
            String xmlVersion=document.getXmlVersion();
            String XmlEncoding = document.getXmlEncoding();
            System.out.println(xmlVersion + "\n" + XmlEncoding);
            NodeList nodeList = document.getElementsByTagName("student");
            int studentsize = nodeList.getLength();
            for (int i = 0; i < studentsize; i++) {
                Node studentNode = nodeList.item(i);
                String studentNodeName = studentNode.getNodeName();
                System.out.println("第" + (i + 1) + "个标签名" + studentNodeName);
                System.out.println("属性遍历");
                NamedNodeMap namedNodeMap = studentNode.getAttributes();

                int attributes_len = namedNodeMap.getLength();

                for (int j = 0; j < attributes_len; j++) {
                    Node attnode = namedNodeMap.item(i);
                    System.out.println(attnode.getNodeName()+"="+attnode.getNodeValue());
                }


                System.out.println("结点遍历");
                NodeList nodeList_childnode = studentNode.getChildNodes();
                int chilenode_len = nodeList_childnode.getLength();
                for (int j = 0; j < chilenode_len; j++) {
                    Node studentNode_childeNode = nodeList_childnode.item(j);
                    if (studentNode_childeNode.getNodeType()==Node.ELEMENT_NODE){
                        System.out.println("标签结点");
                        String nodeTagname = studentNode_childeNode.getNodeName();
                        String nodetagValue = studentNode_childeNode.getTextContent();
                        System.out.println("标签名"+nodeTagname+",标签属性"+nodetagValue);
                    }
                }
                System.out.println("_____________________________________________");
            }
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
