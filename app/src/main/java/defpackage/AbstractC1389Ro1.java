package defpackage;

import java.util.Set;
import java.util.UUID;

/* renamed from: Ro1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1389Ro1 {
    public final UUID a;
    public final C1623Uo1 b;
    public final Set c;

    public AbstractC1389Ro1(UUID uuid, C1623Uo1 c1623Uo1, Set set) {
        O90.f(uuid, NotificationConstants.ID);
        O90.f(c1623Uo1, "workSpec");
        O90.f(set, "tags");
        this.a = uuid;
        this.b = c1623Uo1;
        this.c = set;
    }
}
