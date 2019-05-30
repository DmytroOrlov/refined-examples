import eu.timepit.refined._
import eu.timepit.refined.api.Refined
import eu.timepit.refined.auto._
import eu.timepit.refined.numeric._

import eu.timepit.refined.api.RefType
import eu.timepit.refined.boolean._
import eu.timepit.refined.char._
import eu.timepit.refined.collection._
import eu.timepit.refined.generic._
import eu.timepit.refined.string._

val ls = List(1, 2, 3)

val c1 = refineV[Contains[W.`1`.T]](ls)
//c1: Either[String,eu.timepit.refined.api.Refined[List[Int],eu.timepit.refined.collection.Contains[Int(1)]]] = Right(List(1, 2, 3))

type UserPort = Greater[W.`1023`.T]
//defined type UserPort

val a: Int Refined UserPort = 1024
//a: Refined[Int, UserPort] = 1024
