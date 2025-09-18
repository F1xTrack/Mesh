package p000;

import java.util.Set;
import java.util.UUID;

/* renamed from: Ro1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8227Ro1 {

    /* renamed from: a */
    public final UUID f10433a;

    /* renamed from: b */
    public final C8383Uo1 f10434b;

    /* renamed from: c */
    public final Set f10435c;

    public AbstractC8227Ro1(UUID uuid, C8383Uo1 c8383Uo1, Set set) {
        O90.m5968f(uuid, NotificationConstants.f19487ID);
        O90.m5968f(c8383Uo1, "workSpec");
        O90.m5968f(set, "tags");
        this.f10433a = uuid;
        this.f10434b = c8383Uo1;
        this.f10435c = set;
    }
}
