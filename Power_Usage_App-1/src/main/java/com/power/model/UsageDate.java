package com.power.model;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class UsageDate {
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss") 
	private LocalDateTime fromTime;
	
	
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss") 
	private LocalDateTime toTime;

}
