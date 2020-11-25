package test1;

import java.io.IOException;
import java.util.Iterator;


import javax.xml.parsers.ParserConfigurationException;

import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.xml.sax.SAXException;

/**
 * Java JDK 里 W3C 的document解析方式
 *
 * @author Administrator
 */
public class JavaDocument1 {

    /**
     * @param args
     * @throws ParserConfigurationException
     * @throws IOException
     * @throws SAXException
     */
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException, DocumentException {
        // 要创建一个Document 对象，需要我们先创建一个SAXReader 对象
        SAXReader reader = new SAXReader();
        // 这个对象用于读取xml 文件，然后返回一个Document。
        org.dom4j.Document document = reader.read("D:\\IdeaProjects\\JavaWeb\\homework_1119\\src\\test1\\goods.xml");
        // 打印到控制台，看看是否创建成功
//        System.out.println(document);
        // 获取文档的字符编码 和 版本信息
        String xmlEncoding = document.getXMLEncoding();
        // 打印查看
        System.out.println("xml 文件的  [encoding=" + xmlEncoding + "]");

        Element root = document.getRootElement();
//        System.out.println(root.getName());
//        List<Element> list = root.elements();
        //遍历List的方法
//        for (Element e : list) {
//            System.out.println(e.getName());
//        }


//        //获得指定节点下面的子节点
//        Element contactElem = root.element("good");//首先要知道自己要操作的节点。
//        List<Element> contactList = contactElem.elements();
//        for (Element e : contactList) {
//            System.out.println(e.getName()+":"+e.getText());
//        }


        //调用下面获取子节点的递归函数。
        getChildNodes(root);

        //获得更深层次的标签（一层一层的获取）
//        Element nameElem = root.element("good").element("name");
//        System.out.println(nameElem.getName()+":"+nameElem.getText());
    }

    //递归查询节点函数,输出节点名称
    private static void getChildNodes(Element elem) {
//        System.out.println(elem.getName());
        Iterator<org.dom4j.Node> it = elem.nodeIterator();
        String id = elem.attributeValue("id");
        if (id != null) {
            System.out.println("id:" + id);
        }
        while (it.hasNext()) {
            org.dom4j.Node node = it.next();

            if (node instanceof Element) {
                Element e = (Element) node;
                getChildNodes(e);
                if (!e.getName().equals("good")) {
                    System.out.println(e.getName() + ":" + e.getText());
                }
            }
        }
    }
}
