//package com.example.backend.model;

//import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
//import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
/* ObjectMapper om = new ObjectMapper();
Root root = om.readValue(myJsonString, Root.class); */
//public class Data{
// public String id;
// public String name;
// public String color;
// public String source;
// public String target;
//}
//
//public class Edge{
// public String id;
// public String name;
// public String sourceVertexId;
// public String targetVertexId;
// public Data data;
// public Position position;
// public String group;
// public boolean removed;
// public boolean selected;
// public boolean selectable;
// public boolean locked;
// public boolean grabbable;
// public boolean pannable;
// public String classes;
//}

//public class Editor{
// public Elements elements;
// public ArrayList<Style> style;
// public Data data;
// public boolean zoomingEnabled;
// public boolean userZoomingEnabled;
// public int zoom;
// public double minZoom;
// public double maxZoom;
// public boolean panningEnabled;
// public boolean userPanningEnabled;
// public Pan pan;
// public boolean boxSelectionEnabled;
// public Renderer renderer;
//}

//public class Elements{
// public ArrayList<Node> nodes;
// public ArrayList<Edge> edges;
//}

//public class Model{
// public ArrayList<Edge> edges;
// public String generator;
// public String id;
// public String name;
// public String startElementId;
// public ArrayList<Vertex> vertices;
// public Editor editor;
//}

//public class Node{
// public Data data;
// public Position position;
// public String group;
// public boolean removed;
// public boolean selected;
// public boolean selectable;
// public boolean locked;
// public boolean grabbable;
// public boolean pannable;
// public String classes;
//}
//
//public class Pan{
// public int x;
// public int y;
//}

//public class Position{
// public int x;
// public int y;
//}
//
//public class Properties{
// public int x;
// public int y;
//}
//
//public class Renderer{
// public String name;
//}
//
//public class Root{
// public ArrayList<Model> models;
// public int selectedModelIndex;
// public String selectedElementId;
//}

//public class Style{
// public String selector;
// public Style style;
// @JsonProperty("active-bg-size") 
// public String activeBgSize;
// public String label;
// @JsonProperty("text-wrap") 
// public String textWrap;
// @JsonProperty("text-valign") 
// public String textValign;
// @JsonProperty("text-halign") 
// public String textHalign;
// public String shape;
// public String width;
// public String height;
// public String color;
// @JsonProperty("background-color") 
// public String backgroundColor;
// @JsonProperty("line-color") 
// public String lineColor;
// public String padding;
// @JsonProperty("curve-style") 
// public String curveStyle;
// @JsonProperty("text-rotation") 
// public String textRotation;
// @JsonProperty("target-arrow-shape") 
// public String targetArrowShape;
// @JsonProperty("target-arrow-color") 
// public String targetArrowColor;
// @JsonProperty("control-point-step-size") 
// public String controlPointStepSize;
// @JsonProperty("border-width") 
// public String borderWidth;
// @JsonProperty("border-color") 
// public String borderColor;
//}

//public class Vertex{
// public String id;
// public String name;
// public Properties properties;
//}

