package domain

import play.api.libs.json.Json

/**
  * Created by aidenp on 2016/11/18.
  */
case class Document(id:String,
                    documentType:String,
                    title:String,
                    description:String,
                    format:String,
                    url:String,
                    datePublished:String = Date,
                    dateModified:String = Date,
                    language:String,
                    documentOf:String,
                    relatedItem: String)

object Document{
  implicit val documentFmt = Json.format[Document]
}