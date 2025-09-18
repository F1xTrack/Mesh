package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: v30, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7530v30 implements InterfaceC7420uU {
    public final String a;
    public final List b;
    public final boolean c;

    public AbstractC7530v30(String str, List list, boolean z) {
        this.a = str;
        this.b = Collections.unmodifiableList(list);
        this.c = z;
    }
}
