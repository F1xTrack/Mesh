package p000;

import java.lang.reflect.Field;

/* renamed from: td0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11185td0 extends S22 {

    /* renamed from: a */
    public final Field f43178a;

    public C11185td0(Field field) {
        O90.m5968f(field, "field");
        this.f43178a = field;
    }

    @Override // p000.S22
    /* renamed from: a */
    public final String mo7168a() {
        StringBuilder sb = new StringBuilder();
        Field field = this.f43178a;
        String name = field.getName();
        O90.m5967e(name, "getName(...)");
        sb.append(AbstractC7994Nc0.m5784a(name));
        sb.append("()");
        Class<?> type = field.getType();
        O90.m5967e(type, "getType(...)");
        sb.append(VO0.m8434b(type));
        return sb.toString();
    }
}
