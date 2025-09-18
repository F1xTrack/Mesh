package p000;

import android.app.Notification;
import android.app.Person;

/* renamed from: mw0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10327mw0 {
    /* renamed from: a */
    public static Notification.Builder m23019a(Notification.Builder builder, Person person) {
        return builder.addPerson(person);
    }

    /* renamed from: b */
    public static Notification.Action.Builder m23020b(Notification.Action.Builder builder, int i) {
        return builder.setSemanticAction(i);
    }
}
