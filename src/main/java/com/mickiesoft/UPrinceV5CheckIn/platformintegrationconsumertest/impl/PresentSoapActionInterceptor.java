package com.mickiesoft.UPrinceV5CheckIn.platformintegrationconsumertest.impl;

import org.apache.cxf.binding.soap.SoapBindingConstants;
import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.binding.soap.interceptor.AbstractSoapInterceptor;
import org.apache.cxf.helpers.CastUtils;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.Phase;
import org.apache.cxf.service.model.BindingOperationInfo;
import org.apache.cxf.service.model.InterfaceInfo;
import org.apache.cxf.service.model.OperationInfo;

import javax.xml.namespace.QName;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class PresentSoapActionInterceptor extends AbstractSoapInterceptor {
    private static final String SLASH = "/";

    public PresentSoapActionInterceptor() {
        super(Phase.POST_LOGICAL);
    }

    @Override
    public void handleMessage(SoapMessage message) throws Fault {

        BindingOperationInfo bindingOperationInfo = message.getExchange().getBindingOperationInfo();
        OperationInfo operationInfo = bindingOperationInfo.getOperationInfo();
        InterfaceInfo interfaceInfo = operationInfo.getInterface();
        QName interfaceInfoNameQName = interfaceInfo.getName();
        QName operationQName = operationInfo.getName();

        Map<String, List<String>> reqHeaders = CastUtils.cast((Map<?, ?>) message.get(Message.PROTOCOL_HEADERS));

        if (reqHeaders == null) {
            reqHeaders = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
        }

        if (reqHeaders.size() == 0) {
            message.put(Message.PROTOCOL_HEADERS, reqHeaders);
        }

        reqHeaders.put(SoapBindingConstants.SOAP_ACTION, Arrays.asList("\"" + interfaceInfoNameQName.getNamespaceURI()  + SLASH + operationQName.getLocalPart() + "\""));
    }
}
