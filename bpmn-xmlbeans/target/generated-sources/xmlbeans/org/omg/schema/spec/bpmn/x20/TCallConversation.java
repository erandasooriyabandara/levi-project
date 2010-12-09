/*
 * XML Type:  tCallConversation
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.TCallConversation
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20;


/**
 * An XML tCallConversation(@http://schema.omg.org/spec/BPMN/2.0).
 *
 * This is a complex type.
 */
public interface TCallConversation extends org.omg.schema.spec.bpmn.x20.TConversationNode
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TCallConversation.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBC864EDE3F984128F62D75C6516B63E9").resolveHandle("tcallconversation50e9type");
    
    /**
     * Gets array of all "participantAssociation" elements
     */
    org.omg.schema.spec.bpmn.x20.TParticipantAssociation[] getParticipantAssociationArray();
    
    /**
     * Gets ith "participantAssociation" element
     */
    org.omg.schema.spec.bpmn.x20.TParticipantAssociation getParticipantAssociationArray(int i);
    
    /**
     * Returns number of "participantAssociation" element
     */
    int sizeOfParticipantAssociationArray();
    
    /**
     * Sets array of all "participantAssociation" element
     */
    void setParticipantAssociationArray(org.omg.schema.spec.bpmn.x20.TParticipantAssociation[] participantAssociationArray);
    
    /**
     * Sets ith "participantAssociation" element
     */
    void setParticipantAssociationArray(int i, org.omg.schema.spec.bpmn.x20.TParticipantAssociation participantAssociation);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "participantAssociation" element
     */
    org.omg.schema.spec.bpmn.x20.TParticipantAssociation insertNewParticipantAssociation(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "participantAssociation" element
     */
    org.omg.schema.spec.bpmn.x20.TParticipantAssociation addNewParticipantAssociation();
    
    /**
     * Removes the ith "participantAssociation" element
     */
    void removeParticipantAssociation(int i);
    
    /**
     * Gets the "calledElementRef" attribute
     */
    javax.xml.namespace.QName getCalledElementRef();
    
    /**
     * Gets (as xml) the "calledElementRef" attribute
     */
    org.apache.xmlbeans.XmlQName xgetCalledElementRef();
    
    /**
     * True if has "calledElementRef" attribute
     */
    boolean isSetCalledElementRef();
    
    /**
     * Sets the "calledElementRef" attribute
     */
    void setCalledElementRef(javax.xml.namespace.QName calledElementRef);
    
    /**
     * Sets (as xml) the "calledElementRef" attribute
     */
    void xsetCalledElementRef(org.apache.xmlbeans.XmlQName calledElementRef);
    
    /**
     * Unsets the "calledElementRef" attribute
     */
    void unsetCalledElementRef();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.omg.schema.spec.bpmn.x20.TCallConversation newInstance() {
          return (org.omg.schema.spec.bpmn.x20.TCallConversation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.omg.schema.spec.bpmn.x20.TCallConversation newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.omg.schema.spec.bpmn.x20.TCallConversation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.omg.schema.spec.bpmn.x20.TCallConversation parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.omg.schema.spec.bpmn.x20.TCallConversation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.omg.schema.spec.bpmn.x20.TCallConversation parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.omg.schema.spec.bpmn.x20.TCallConversation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.omg.schema.spec.bpmn.x20.TCallConversation parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.TCallConversation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.omg.schema.spec.bpmn.x20.TCallConversation parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.TCallConversation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.omg.schema.spec.bpmn.x20.TCallConversation parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.TCallConversation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.omg.schema.spec.bpmn.x20.TCallConversation parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.TCallConversation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.omg.schema.spec.bpmn.x20.TCallConversation parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.TCallConversation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.omg.schema.spec.bpmn.x20.TCallConversation parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.TCallConversation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.omg.schema.spec.bpmn.x20.TCallConversation parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.TCallConversation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.omg.schema.spec.bpmn.x20.TCallConversation parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.omg.schema.spec.bpmn.x20.TCallConversation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.omg.schema.spec.bpmn.x20.TCallConversation parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.omg.schema.spec.bpmn.x20.TCallConversation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.omg.schema.spec.bpmn.x20.TCallConversation parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.omg.schema.spec.bpmn.x20.TCallConversation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.omg.schema.spec.bpmn.x20.TCallConversation parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.omg.schema.spec.bpmn.x20.TCallConversation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.omg.schema.spec.bpmn.x20.TCallConversation parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.omg.schema.spec.bpmn.x20.TCallConversation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.omg.schema.spec.bpmn.x20.TCallConversation parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.omg.schema.spec.bpmn.x20.TCallConversation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.omg.schema.spec.bpmn.x20.TCallConversation parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.omg.schema.spec.bpmn.x20.TCallConversation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}