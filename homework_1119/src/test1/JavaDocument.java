package test1; /**
 * 作者：ysq
 * 日期: 2020/11/19 18:09
 * 描述:
 */
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
 * Java JDK 里 W3C 的document解析方式
 *
 * @author Administrator
 */
public class JavaDocument {

    /**
     * @param args
     * @throws ParserConfigurationException
     * @throws IOException
     * @throws SAXException
     */
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        //先通过documentBuilderFactory创建一个documentBuilder的实例
        DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        // documentBuilder专门用来解析xml文档。获得一个Document对象
        Document document = documentBuilder.parse(JavaDocument.class.getResourceAsStream("/test1/goods.xml"));


        // 获取文档的字符编码 和 版本信息
        String xmlVersion = document.getXmlVersion();
        String xmlEncoding = document.getXmlEncoding();
        // 打印查看
        System.out.println("xml 文件的  [version=" + xmlVersion + " , encoding=" + xmlEncoding + "]");

        NodeList nodeList = document.getElementsByTagName("good");
        int goodsElementSize = nodeList.getLength();
        for (int i = 0; i < goodsElementSize; i++) {
            Node goodNode = nodeList.item(i);
            String goodNodeName = goodNode.getNodeName();
            System.out.println("第" + (i + 1) + "标签名: " + goodNodeName);
            System.out.println(" 属 性 遍 历 ");

            NamedNodeMap goodNode_attributes = goodNode.getAttributes();
            int attribute_len = goodNode_attributes.getLength();
            for (int k = 0; k < attribute_len; k++) {
                Node attNode = goodNode_attributes.item(k);
                System.out.println(attNode.getNodeName() + "=" + attNode.getNodeValue());
            }



            System.out.println(" 结 点 遍 历 ");


            NodeList goodNode_childList = goodNode.getChildNodes();
            int goodNode_childList_size = goodNode_childList.getLength();
            System.out.println(goodNode_childList_size);
            for (int j = 0; j < goodNode_childList_size; j++) {
                Node goodNode_childNode = goodNode_childList.item(j);
                if (goodNode_childNode.getNodeType() == Node.ELEMENT_NODE) {
                    System.out.println("标签结点");
                    String nodeTagName = goodNode_childNode.getNodeName();
                    String node_innerHTML = goodNode_childNode.getTextContent();
                    System.out.println(" 标签名: " + nodeTagName + " , innerHTML: " + node_innerHTML);

                } else if (goodNode_childNode.getNodeType() == Node.TEXT_NODE) {
                    System.out.println("文本结点");
                }
                System.out.println();
            }

            System.out.println("_______________________________________________");
        }

    }

}