package parser;

import dto.ElectronicDocumentsDTO;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONObject;
import org.json.XML;
import java.util.logging.Logger;

import java.nio.charset.Charset;
public class XMLParser
{
//    private static final Logger LOGGER = Logger.getLogger(XMLParser.class.getName());
//
//    public static ElectronicDocumentsDTO parseXML(byte[] data) throws Exception
//    {
//        try
//        {
//            // Преобразование XML в JSON
//            String xmlString = new String(data, Charset.forName("cp1251"));
//            JSONObject xmlJSONObj = XML.toJSONObject(xmlString, true);
//            String json = xmlJSONObj.toString();
//
//            // Конфигурация ObjectMapper
//            ObjectMapper mapper = new ObjectMapper();
//            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
//            mapper.configure(DeserializationFeature.UNWRAP_ROOT_VALUE, true);
//            mapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
//
//            // Десериализация JSON в объект DTO
//            return mapper.readValue(json, ElectronicDocumentsDTO.class);
//        } catch (Exception e)
//        {
//            LOGGER.severe("Error parsing XML" + e.getMessage());
//        }
//
//        return ElectronicDocumentsDTO;
//    }
}
