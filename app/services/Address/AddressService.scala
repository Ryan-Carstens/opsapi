package services.Address

import com.websudos.phantom.dsl._
import domain.Address

import services.Address.Impl.AddressServiceImpl


import scala.concurrent.Future

/**
  * Created by Aphiwe on 2016/11/02.
  */
trait AddressService {
  def createOrUpdate(addressType:Address):Future[ResultSet]

  def getAddressTypeById(addressType: String): Future[Option[Address]]

  def getAddressTypes(addressType: String): Future[Seq[Address]]
}

object AddressService{
  def apply: AddressService = new AddressServiceImpl()
}