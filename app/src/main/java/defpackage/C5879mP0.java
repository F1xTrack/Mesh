package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.Member;

/* renamed from: mP0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5879mP0 extends AbstractC6261oP0 {
    public final Field a;

    public C5879mP0(Field field) {
        O90.f(field, "member");
        this.a = field;
    }

    @Override // defpackage.AbstractC6261oP0
    public final Member b() {
        return this.a;
    }
}
