package views.html

import controllers.notifications._
import play.api.templates._
import play.api.i18n.Messages

object notification {
  def apply(notification: Notification): Html = {
    val kindClass = notification.kind match {
      case Success => "success"
      case Error => "error"
    }
    Html(
        """<span class="notification %s"> - %s <span class="button" title="%s">X</span></span>"""
            .format(kindClass, notification.message, Messages("hide"))
    )
  }
}