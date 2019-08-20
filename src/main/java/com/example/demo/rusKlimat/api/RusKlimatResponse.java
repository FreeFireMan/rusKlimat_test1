package com.example.demo.rusKlimat.api;

import com.example.demo.model.Mtp;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import lombok.Data;

import java.util.List;

@Data
public class RusKlimatResponse {
    private String status;
    private int count;
    private Object data;
}
