package controller;

import dto.ElectronicDocumentsDTO;

import org.json.JSONObject;
import org.json.XML;
import service.ElectronicDocumentsService;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.nio.charset.Charset;
import java.util.List;

@RestController
@RequestMapping("/api/electronic-documents")
public class ElectronicDocumentsController
{

    private final ElectronicDocumentsService electronicDocumentsService;
    public ElectronicDocumentsController(ElectronicDocumentsService electronicDocumentsService) {
        this.electronicDocumentsService = electronicDocumentsService;
    }
    //нормально написать ("/{edNo}")
    @PostMapping
    public ElectronicDocumentsDTO createElectronicDocument(@RequestBody ElectronicDocumentsDTO electronicDocumentsDTO) {
        return electronicDocumentsService.createElectronicDocument(electronicDocumentsDTO);
    }

    @GetMapping("/{edNo}")
    public ElectronicDocumentsDTO getElectronicDocumentByEdNo(@PathVariable Long id) {
        return electronicDocumentsService.getElectronicDocument(id);
    }

    @GetMapping
    public List<ElectronicDocumentsDTO> getAllElectronicDocuments() {
        return electronicDocumentsService.getAllElectronicDocuments();
    }

    @PutMapping("/{id}")
    public ElectronicDocumentsDTO updateElectronicDocument(@PathVariable Long id, @RequestBody ElectronicDocumentsDTO electronicDocumentsDTO) {
        return electronicDocumentsService.updateElectronicDocument(id, electronicDocumentsDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteElectronicDocument(@PathVariable Long id) {
        electronicDocumentsService.deleteElectronicDocuments(id);
    }

//    public void processXMLFile(MultipartFile fileContent) throws Exception {
//        byte[] data = fileContent.getBytes();
//        JSONObject xmlJSONObj = XML.toJSONObject(new String(data, Charset.forName("cp1251")), true);
//        ObjectMapper mapper = new ObjectMapper();
//        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
//                .configure(DeserializationFeature.UNWRAP_ROOT_VALUE, true)
//                .configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
//        String json = xmlJSONObj.toString();
//        ElectronicDocumentsDTO dto = mapper.readValue(json, ElectronicDocumentsDTO.class);
//
//    }
}
