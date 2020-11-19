import com.intellij.notification.Notification
import com.intellij.notification.NotificationType
import com.intellij.notification.Notifications
import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent

class ShowNotificationAction : AnAction() {
  override fun actionPerformed(e: AnActionEvent) {
    val notification = Notification(ShowNotificationAction::javaClass.name,
                                    "Incompatible plugin for ▶️ 4.1 and ◀️ 4.0",
                                    "Compatible from 4.0 (191) to 4.1 (201) only",
                                    NotificationType.INFORMATION)
    Notifications.Bus.notify(notification)
  }
}