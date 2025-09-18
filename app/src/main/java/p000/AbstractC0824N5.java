package p000;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.InvalidArgsNumberException;
import expo.modules.kotlin.exception.UnexpectedException;
import expo.modules.kotlin.jni.JavaScriptModuleObject;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: N5 */
/* loaded from: classes2.dex */
public abstract class AbstractC0824N5 {

    /* renamed from: a */
    public final String f7489a;

    /* renamed from: b */
    public final C0887O5[] f7490b;

    /* renamed from: c */
    public final int f7491c;

    public AbstractC0824N5(String str, C0887O5[] c0887o5Arr) {
        List listM4174E;
        this.f7489a = str;
        this.f7490b = c0887o5Arr;
        if (c0887o5Arr.length == 0) {
            listM4174E = C0779MN.f7117a;
        } else {
            listM4174E = AbstractC0576J8.m4174E(c0887o5Arr);
            Collections.reverse(listM4174E);
        }
        Iterator it = listM4174E.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (!((C0887O5) it.next()).f8215a.f12694b) {
                break;
            } else {
                i++;
            }
        }
        this.f7491c = i >= 0 ? this.f7490b.length - i : 0;
    }

    /* renamed from: a */
    public abstract void mo5538a(C0134C7 c0134c7, JavaScriptModuleObject javaScriptModuleObject);

    /* renamed from: b */
    public final Object[] m5539b(ReadableArray readableArray) throws InvalidArgsNumberException {
        O90.m5968f(readableArray, "args");
        int size = readableArray.size();
        C0887O5[] c0887o5Arr = this.f7490b;
        int i = this.f7491c;
        if (i > size || readableArray.size() > c0887o5Arr.length) {
            throw new InvalidArgsNumberException(readableArray.size(), c0887o5Arr.length, i);
        }
        int length = c0887o5Arr.length;
        Object[] objArr = new Object[length];
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            objArr[i3] = null;
        }
        int size2 = readableArray.size();
        int i4 = 0;
        while (i2 < size2) {
            C0887O5 c0887o5 = c0887o5Arr[i2];
            int i5 = i4 + 1;
            Dynamic dynamic = readableArray.getDynamic(i4);
            try {
                objArr[i2] = ((AbstractC8309Td1) c0887o5.f8216b.getValue()).mo7706a(dynamic, null);
                dynamic.recycle();
                i2++;
                i4 = i5;
            } finally {
            }
        }
        return objArr;
    }

    /* renamed from: c */
    public final Object[] m5540c(Object[] objArr, C0134C7 c0134c7) throws InvalidArgsNumberException, C6281k8 {
        O90.m5968f(objArr, "args");
        int length = objArr.length;
        C0887O5[] c0887o5Arr = this.f7490b;
        int i = this.f7491c;
        if (i > length || objArr.length > c0887o5Arr.length) {
            throw new InvalidArgsNumberException(objArr.length, c0887o5Arr.length, i);
        }
        int length2 = c0887o5Arr.length;
        Object[] objArr2 = new Object[length2];
        int i2 = 0;
        while (true) {
            if (i2 >= length2) {
                break;
            }
            objArr2[i2] = null;
            i2++;
        }
        C6653q0 c6653q0M3386a = HN1.m3386a(objArr);
        int length3 = objArr.length;
        for (int i3 = 0; i3 < length3; i3++) {
            Object next = c6653q0M3386a.next();
            C0887O5 c0887o5 = c0887o5Arr[i3];
            try {
                objArr2[i3] = ((AbstractC8309Td1) c0887o5.f8216b.getValue()).mo7706a(next, c0134c7);
            } catch (Throwable th) {
                throw new C6281k8(c0887o5.f8215a, i3, String.valueOf(next != null ? next.getClass() : null), th instanceof CodedException ? (CodedException) th : th instanceof AbstractC6266ju ? new CodedException(((AbstractC6266ju) th).mo2811a(), th.getMessage(), th.getCause()) : new UnexpectedException(th.toString(), th));
            }
        }
        return objArr2;
    }
}
