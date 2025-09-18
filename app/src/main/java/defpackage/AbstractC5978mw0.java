package defpackage;

import android.app.Notification;
import android.app.Person;

/* renamed from: mw0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5978mw0 {
    public static Notification.Builder a(Notification.Builder builder, Person person) {
        return builder.addPerson(person);
    }

    public static Notification.Action.Builder b(Notification.Action.Builder builder, int i) {
        return builder.setSemanticAction(i);
    }
}
