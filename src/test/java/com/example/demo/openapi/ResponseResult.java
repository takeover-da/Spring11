package com.example.demo.openapi;

import java.util.ArrayList;

import lombok.ToString;

@ToString
 class Body{
  String dataType;
  Items items;
  int pageNo;
  int numOfRows;
  int totalCount;
}

@ToString
 class Header{
  String resultCode;
  String resultMsg;
}

@ToString
 class Item{
  Object announceTime;
  int numEf;
  String regId;
  int rnSt;
  int rnYn;
  String ta;
  String wd1;
  String wd2;
  String wdTnd;
  String wf;
  String wfCd;
  String wsIt;
}

@ToString
 class Items{
  ArrayList<Item> item;
}

@ToString
 class Response{
  Header header;
  Body body;
}

@ToString
 class Root{
  Response response;
}

