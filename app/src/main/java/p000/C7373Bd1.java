package p000;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.security.PrivilegedAction;
import java.util.ArrayList;

/* renamed from: Bd1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7373Bd1 implements PrivilegedAction {

    /* renamed from: a */
    public final /* synthetic */ int f958a;

    /* renamed from: b */
    public final /* synthetic */ Class f959b;

    public /* synthetic */ C7373Bd1(int i, Class cls) {
        this.f958a = i;
        this.f959b = cls;
    }

    @Override // java.security.PrivilegedAction
    public final Object run() throws SecurityException {
        switch (this.f958a) {
            case 0:
                Field[] declaredFields = this.f959b.getDeclaredFields();
                ArrayList arrayList = new ArrayList(declaredFields.length);
                for (Field field : declaredFields) {
                    if (field.isEnumConstant()) {
                        arrayList.add(field);
                    }
                }
                Field[] fieldArr = (Field[]) arrayList.toArray(new Field[0]);
                AccessibleObject.setAccessible(fieldArr, true);
                return fieldArr;
            default:
                Field[] declaredFields2 = this.f959b.getDeclaredFields();
                ArrayList arrayList2 = new ArrayList(declaredFields2.length);
                for (Field field2 : declaredFields2) {
                    if (field2.isEnumConstant()) {
                        arrayList2.add(field2);
                    }
                }
                Field[] fieldArr2 = (Field[]) arrayList2.toArray(new Field[0]);
                AccessibleObject.setAccessible(fieldArr2, true);
                return fieldArr2;
        }
    }
}
