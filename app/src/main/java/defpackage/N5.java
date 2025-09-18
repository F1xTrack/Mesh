package defpackage;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.InvalidArgsNumberException;
import expo.modules.kotlin.exception.UnexpectedException;
import expo.modules.kotlin.jni.JavaScriptModuleObject;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class N5 {
    public final String a;
    public final O5[] b;
    public final int c;

    public N5(String str, O5[] o5Arr) {
        List listE;
        this.a = str;
        this.b = o5Arr;
        if (o5Arr.length == 0) {
            listE = MN.a;
        } else {
            listE = J8.E(o5Arr);
            Collections.reverse(listE);
        }
        Iterator it = listE.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (!((O5) it.next()).a.b) {
                break;
            } else {
                i++;
            }
        }
        this.c = i >= 0 ? this.b.length - i : 0;
    }

    public abstract void a(C7 c7, JavaScriptModuleObject javaScriptModuleObject);

    public final Object[] b(ReadableArray readableArray) throws InvalidArgsNumberException {
        O90.f(readableArray, "args");
        int size = readableArray.size();
        O5[] o5Arr = this.b;
        int i = this.c;
        if (i > size || readableArray.size() > o5Arr.length) {
            throw new InvalidArgsNumberException(readableArray.size(), o5Arr.length, i);
        }
        int length = o5Arr.length;
        Object[] objArr = new Object[length];
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            objArr[i3] = null;
        }
        int size2 = readableArray.size();
        int i4 = 0;
        while (i2 < size2) {
            O5 o5 = o5Arr[i2];
            int i5 = i4 + 1;
            Dynamic dynamic = readableArray.getDynamic(i4);
            try {
                objArr[i2] = ((AbstractC1512Td1) o5.b.getValue()).a(dynamic, null);
                dynamic.recycle();
                i2++;
                i4 = i5;
            } finally {
            }
        }
        return objArr;
    }

    public final Object[] c(Object[] objArr, C7 c7) throws InvalidArgsNumberException, C5445k8 {
        O90.f(objArr, "args");
        int length = objArr.length;
        O5[] o5Arr = this.b;
        int i = this.c;
        if (i > length || objArr.length > o5Arr.length) {
            throw new InvalidArgsNumberException(objArr.length, o5Arr.length, i);
        }
        int length2 = o5Arr.length;
        Object[] objArr2 = new Object[length2];
        int i2 = 0;
        while (true) {
            if (i2 >= length2) {
                break;
            }
            objArr2[i2] = null;
            i2++;
        }
        C6563q0 c6563q0A = HN1.a(objArr);
        int length3 = objArr.length;
        for (int i3 = 0; i3 < length3; i3++) {
            Object next = c6563q0A.next();
            O5 o5 = o5Arr[i3];
            try {
                objArr2[i3] = ((AbstractC1512Td1) o5.b.getValue()).a(next, c7);
            } catch (Throwable th) {
                throw new C5445k8(o5.a, i3, String.valueOf(next != null ? next.getClass() : null), th instanceof CodedException ? (CodedException) th : th instanceof AbstractC5398ju ? new CodedException(((AbstractC5398ju) th).a(), th.getMessage(), th.getCause()) : new UnexpectedException(th.toString(), th));
            }
        }
        return objArr2;
    }
}
