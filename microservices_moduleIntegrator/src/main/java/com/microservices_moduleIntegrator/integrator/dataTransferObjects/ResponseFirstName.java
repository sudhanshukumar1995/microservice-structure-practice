package com.microservices_moduleIntegrator.integrator.dataTransferObjects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
/*
 * When using the class as a DTO/POJO. It will throw an error on sending rest
 * request when using ONLY @AllArgsConstructor annotation. Since, the DTO needs
 * default constructor as well to serialize and not parameterized one. Hence,
 * include the NoArgs Constructor as well as AllArgs annotation
 */
@NoArgsConstructor
public class ResponseFirstName {
	private String firstName;
}
