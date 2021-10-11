package purecoincidence

import io.circe.{Encoder, Decoder}

trait JsonCodec {
  sealed trait GameName
  case object Moogoonghwa extends GameName
  case object Bbopki extends GameName

  implicit val gameNameEncoder: Encoder[GameName] = Encoder.encodeString.contramap {
    case Moogoonghwa => "무궁화"
    case Bbopki => "뽑기게임"
  }

  implicit val gameNameDecoder: Decoder[GameName] = Decoder.decodeString.map {
    case "무궁화" => Moogoonghwa
    case "뽑기게임" => Bbopki
  }
}
