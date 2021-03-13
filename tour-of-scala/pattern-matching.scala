import scala.util.Random
object PatternMatching {
  abstract class Notification

  case class Email(sender: String, title: String, body: String)
      extends Notification
  case class SMS(caller: String, message: String) extends Notification
  case class VoiceRecording(contactName: String, link: String)
      extends Notification

  def main(args: Array[String]) = {
    {
      val x: Int = Random.nextInt(10)

      x match {
        case 0 => "zero"
        case 1 => "one"
        case 2 => "two"
        case _ => "other"
      }
    }

    /// Matching on case classes

    {
      def showNotification(notification: Notification): String = {
        notification match {
          case Email(sender, title, _) =>
            s"You got an email from $sender with title: $title"
          case SMS(number, message) =>
            s"You got an SMS from $number! Message: $message"
          case VoiceRecording(name, link) =>
            s"You received a Voice Recording from $name! Click the link to hear it: $link"
        }
      }
      val someSms = SMS("12345", "Are you there?")
      val someVoiceRecording =
        VoiceRecording("Tom", "voicerecording.org/id/123")

      println(showNotification(someSms))
      println(showNotification(someVoiceRecording))
    }
  }
}
