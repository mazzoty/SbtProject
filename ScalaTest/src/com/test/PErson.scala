package com.test

import scala.collection.mutable.ListBuffer

/**
 * Created by silviu on 3/16/14.
 */
case class Person (name:String,surname:String){
  private var messageQueue = new ListBuffer[String]()


  def getFullName(name:String,surname:String):String={
   name + "/"+surname
  }

  def getAllNames(name:String) = (surname:String) =>  name+surname

  def push(value:String){
    messageQueue+=value
  }

  def pop(){
    messageQueue.remove(0)
  }
  
  
  def removeAll(){
    
  }


}
