package defpackage;

import java.lang.reflect.Field;

/* renamed from: td0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7257td0 extends S22 {
    public final Field a;

    public C7257td0(Field field) {
        O90.f(field, "field");
        this.a = field;
    }

    @Override // defpackage.S22
    public final String a() {
        StringBuilder sb = new StringBuilder();
        Field field = this.a;
        String name = field.getName();
        O90.e(name, "getName(...)");
        sb.append(AbstractC1040Nc0.a(name));
        sb.append("()");
        Class<?> type = field.getType();
        O90.e(type, "getType(...)");
        sb.append(VO0.b(type));
        return sb.toString();
    }
}
