package com.example.ble;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;
import org.w3c.dom.UserDataHandler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Text txt = new Text() {
            @Override
            public Text splitText(int i) throws DOMException {

                return null;
            }

            @Override
            public boolean isElementContentWhitespace() {
                return false;
            }

            @Override
            public String getWholeText() {
                return null;
            }

            @Override
            public Text replaceWholeText(String s) throws DOMException {
                return null;
            }

            @Override
            public String getData() throws DOMException {
                return null;
            }

            @Override
            public void setData(String s) throws DOMException {

            }

            @Override
            public int getLength() {
                return 0;
            }

            @Override
            public String substringData(int i, int i1) throws DOMException {
                return null;
            }

            @Override
            public void appendData(String s) throws DOMException {

            }

            @Override
            public void insertData(int i, String s) throws DOMException {

            }

            @Override
            public void deleteData(int i, int i1) throws DOMException {

            }

            @Override
            public void replaceData(int i, int i1, String s) throws DOMException {

            }

            @Override
            public String getNodeName() {
                return null;
            }

            @Override
            public String getNodeValue() throws DOMException {
                return null;
            }

            @Override
            public void setNodeValue(String s) throws DOMException {

            }

            @Override
            public short getNodeType() {
                return 0;
            }

            @Override
            public Node getParentNode() {
                return null;
            }

            @Override
            public NodeList getChildNodes() {
                return null;
            }

            @Override
            public Node getFirstChild() {
                return null;
            }

            @Override
            public Node getLastChild() {
                return null;
            }

            @Override
            public Node getPreviousSibling() {
                return null;
            }

            @Override
            public Node getNextSibling() {
                return null;
            }

            @Override
            public NamedNodeMap getAttributes() {
                return null;
            }

            @Override
            public Document getOwnerDocument() {
                return null;
            }

            @Override
            public Node insertBefore(Node node, Node node1) throws DOMException {
                return null;
            }

            @Override
            public Node replaceChild(Node node, Node node1) throws DOMException {
                return null;
            }

            @Override
            public Node removeChild(Node node) throws DOMException {
                return null;
            }

            @Override
            public Node appendChild(Node node) throws DOMException {
                return null;
            }

            @Override
            public boolean hasChildNodes() {
                return false;
            }

            @Override
            public Node cloneNode(boolean b) {
                return null;
            }

            @Override
            public void normalize() {

            }

            @Override
            public boolean isSupported(String s, String s1) {
                return false;
            }

            @Override
            public String getNamespaceURI() {
                return null;
            }

            @Override
            public String getPrefix() {
                return null;
            }

            @Override
            public void setPrefix(String s) throws DOMException {

            }

            @Override
            public String getLocalName() {
                return null;
            }

            @Override
            public boolean hasAttributes() {
                return false;
            }

            @Override
            public String getBaseURI() {
                return null;
            }

            @Override
            public short compareDocumentPosition(Node node) throws DOMException {
                return 0;
            }

            @Override
            public String getTextContent() throws DOMException {
                System.out.println("dgfhkd");
                return null;
            }

            @Override
            public void setTextContent(String s) throws DOMException {

            }

            @Override
            public boolean isSameNode(Node node) {
                return false;
            }

            @Override
            public String lookupPrefix(String s) {
                return null;
            }

            @Override
            public boolean isDefaultNamespace(String s) {
                return false;
            }

            @Override
            public String lookupNamespaceURI(String s) {
                return null;
            }

            @Override
            public boolean isEqualNode(Node node) {
                return false;
            }

            @Override
            public Object getFeature(String s, String s1) {
                return null;
            }

            @Override
            public Object setUserData(String s, Object o, UserDataHandler userDataHandler) {
                return null;
            }

            @Override
            public Object getUserData(String s) {
                return null;
            }
        };
    }
}