// Copyright (c) 2016-2020 Association of Universities for Research in Astronomy, Inc. (AURA)
// For license information see LICENSE or https://opensource.org/licenses/BSD-3-Clause

package clue

import cats.syntax.all._

case class WebSocketCloseParams(code: Option[Int] = none, reason: Option[String] = none)
object WebSocketCloseParams {
  def apply(code:   Int): WebSocketCloseParams = WebSocketCloseParams(code = code.some)
  def apply(reason: String): WebSocketCloseParams = WebSocketCloseParams(reason = reason.some)
  def apply(code:   Int, reason: String): WebSocketCloseParams =
    WebSocketCloseParams(code = code.some, reason = reason.some)
}
case class WebSocketCloseEvent(code: Int, reason: String, wasClean: Boolean)

trait WebSocketBackend[F[_]] extends PersistentBackend[F, WebSocketCloseParams, WebSocketCloseEvent]

trait WebSocketConnection[F[_]] extends PersistentConnection[F, WebSocketCloseParams]