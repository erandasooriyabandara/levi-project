/*
 * An XML document type.
 * Localname: globalCommunication
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.GlobalCommunicationDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20;


/**
 * A document containing one globalCommunication(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public interface GlobalCommunicationDocument extends org.omg.schema.spec.bpmn.x20.RootElementDocument
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GlobalCommunicationDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBC864EDE3F984128F62D75C6516B63E9").resolveHandle("globalcommunication4a77doctype");
    
    /**
     * Gets the "globalCommunication" element
     */
    org.omg.schema.spec.bpmn.x20.TGlobalCommunication getGlobalCommunication();
    
    /**
     * Sets the "globalCommunication" element
     */
    void setGlobalCommunication(org.omg.schema.spec.bpmn.x20.TGlobalCommunication globalCommunication);
    
    /**
     * Appends and returns a new empty "globalCommunication" element
     */
    org.omg.schema.spec.bpmn.x20.TGlobalCommunication addNewGlobalCommunication();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.omg.schema.spec.bpmn.x20.GlobalCommunicationDocument newInstance() {
          return (org.omg.schema.spec.bpmn.x20.GlobalCommunicationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.omg.schema.spec.bpmn.x20.GlobalCommunicationDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.omg.schema.spec.bpmn.x20.GlobalCommunicationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.omg.schema.spec.bpmn.x20.GlobalCommunicationDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.omg.schema.spec.bpmn.x20.GlobalCommunicationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.omg.schema.spec.bpmn.x20.GlobalCommunicationDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.omg.schema.spec.bpmn.x20.GlobalCommunicationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.omg.schema.spec.bpmn.x20.GlobalCommunicationDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.GlobalCommunicationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.omg.schema.spec.bpmn.x20.GlobalCommunicationDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.GlobalCommunicationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.omg.schema.spec.bpmn.x20.GlobalCommunicationDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.GlobalCommunicationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.omg.schema.spec.bpmn.x20.GlobalCommunicationDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.GlobalCommunicationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.omg.schema.spec.bpmn.x20.GlobalCommunicationDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.GlobalCommunicationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.omg.schema.spec.bpmn.x20.GlobalCommunicationDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.GlobalCommunicationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.omg.schema.spec.bpmn.x20.GlobalCommunicationDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.GlobalCommunicationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.omg.schema.spec.bpmn.x20.GlobalCommunicationDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.GlobalCommunicationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.omg.schema.spec.bpmn.x20.GlobalCommunicationDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.omg.schema.spec.bpmn.x20.GlobalCommunicationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.omg.schema.spec.bpmn.x20.GlobalCommunicationDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.omg.schema.spec.bpmn.x20.GlobalCommunicationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.omg.schema.spec.bpmn.x20.GlobalCommunicationDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.omg.schema.spec.bpmn.x20.GlobalCommunicationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.omg.schema.spec.bpmn.x20.GlobalCommunicationDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.omg.schema.spec.bpmn.x20.GlobalCommunicationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.omg.schema.spec.bpmn.x20.GlobalCommunicationDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.omg.schema.spec.bpmn.x20.GlobalCommunicationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.omg.schema.spec.bpmn.x20.GlobalCommunicationDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.omg.schema.spec.bpmn.x20.GlobalCommunicationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}