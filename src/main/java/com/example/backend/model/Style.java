package com.example.backend.model;

import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1

public class Style{
	 public String selector;
	 public Style style;
	 @JsonProperty("active-bg-size") 
	 public String activeBgSize;
	 public String label;
	 @JsonProperty("text-wrap") 
	 public String textWrap;
	 @JsonProperty("text-valign") 
	 public String textValign;
	 @JsonProperty("text-halign") 
	 public String textHalign;
	 public String shape;
	 public String width;
	 public String height;
	 public String color;
	 @JsonProperty("background-color") 
	 public String backgroundColor;
	 @JsonProperty("line-color") 
	 public String lineColor;
	 public String padding;
	 @JsonProperty("curve-style") 
	 public String curveStyle;
	 @JsonProperty("text-rotation") 
	 public String textRotation;
	 @JsonProperty("target-arrow-shape") 
	 public String targetArrowShape;
	 @JsonProperty("target-arrow-color") 
	 public String targetArrowColor;
	 @JsonProperty("control-point-step-size") 
	 public String controlPointStepSize;
	 @JsonProperty("border-width") 
	 public String borderWidth;
	 @JsonProperty("border-color") 
	 public String borderColor;
	}

