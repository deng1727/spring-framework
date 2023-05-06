package org.springframework.pojo;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter
@Setter
@ToString
public class ApiInfo {

    private String id;

    private String method;

    private String path;


}
