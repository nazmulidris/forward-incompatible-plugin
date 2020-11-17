import com.intellij.notification.Notification
import com.intellij.notification.NotificationType
import com.intellij.notification.Notifications
import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent

class ShowNotificationAction : AnAction() {
  override fun actionPerformed(e: AnActionEvent) {
    val notification = Notification(ShowNotificationAction::javaClass.name,
                                    "Incompatible with 4.1.1 or 201",
                                    "Compatible with 4.0.2 or 193",
                                    NotificationType.INFORMATION)
    Notifications.Bus.notify(notification)

  }
}