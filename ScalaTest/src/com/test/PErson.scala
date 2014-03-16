package com.test

/**
 * Created by silviu on 3/16/14.
 */
case class Person (name:String,surname:String){


  def getFullName(name:String,surname:String):String={
   name + "/"+surname
  }

  def getAllNames(name:String) = (surname:String) =>  name+surname


}
