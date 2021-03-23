// Copyright (c) 2016-2021 Association of Universities for Research in Astronomy, Inc. (AURA)
// For license information see LICENSE or https://opensource.org/licenses/BSD-3-Clause

package test2

import clue.annotation.GraphQLSchema

@GraphQLSchema
object StarWarsGQL

/* BEGIN: Generated by clue. DO NOT remove or edit the following code or this comment. */
// format: off
sealed trait StarWars
object StarWars {
  object Scalars { def ignoreUnusedImportScalars(): Unit = () }
  object Enums {
    def ignoreUnusedImportEnums(): Unit = ()
    sealed trait Episode
    object Episode {
      case object Newhope extends Episode()
      case object Empire extends Episode()
      case object Jedi extends Episode()
      implicit val eqEpisode: cats.Eq[Episode] = cats.Eq.fromUniversalEquals
      implicit val showEpisode: cats.Show[Episode] = cats.Show.fromToString
      implicit val jsonEncoderEpisode: io.circe.Encoder[Episode] = io.circe.Encoder.encodeString.contramap[Episode]({
        case Newhope => "NEWHOPE"
        case Empire => "EMPIRE"
        case Jedi => "JEDI"
      })
      implicit val jsonDecoderEpisode: io.circe.Decoder[Episode] = io.circe.Decoder.decodeString.emapTry(s => scala.util.Try(s match {
        case "NEWHOPE" => Newhope
        case "EMPIRE" => Empire
        case "JEDI" => Jedi
      }))
    }
  }
  object Types {
    import Scalars._
    ignoreUnusedImportScalars()
    import Enums._
    ignoreUnusedImportEnums()
    def ignoreUnusedImportTypes(): Unit = ()
  }
}
// format: on
/* END: Generated by clue. Will be replaced when regenerating. */

object AfterSchema
