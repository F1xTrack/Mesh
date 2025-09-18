package defpackage;

import android.os.AsyncTask;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableArray;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: kL0 */
/* loaded from: classes.dex */
public final class AsyncTaskC5485kL0 extends AsyncTask {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ AsyncTaskC5485kL0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        Object obj = this.b;
        switch (this.a) {
            case 0:
                String[] strArr = (String[]) objArr;
                WritableArray writableArrayCreateArray = Arguments.createArray();
                Callback callback = (Callback) obj;
                if (strArr[0] == null) {
                    callback.invoke("the path specified for lstat is either `null` or `undefined`.");
                } else {
                    File file = new File(strArr[0]);
                    if (file.exists()) {
                        if (file.isDirectory()) {
                            for (String str : file.list()) {
                                writableArrayCreateArray.pushMap(AbstractC5867mL0.f(file.getPath() + "/" + str));
                            }
                        } else {
                            writableArrayCreateArray.pushMap(AbstractC5867mL0.f(file.getAbsolutePath()));
                        }
                        callback.invoke(null, writableArrayCreateArray);
                    } else {
                        callback.invoke(AbstractC1705Vq.l(new StringBuilder("failed to lstat path `"), strArr[0], "` because it does not exist or it is not a folder"));
                    }
                }
                return 0;
            case 1:
                ReadableArray[] readableArrayArr = (ReadableArray[]) objArr;
                Callback callback2 = (Callback) obj;
                try {
                    ArrayList arrayList = new ArrayList();
                    for (int i = 0; i < readableArrayArr[0].size(); i++) {
                        String string = readableArrayArr[0].getString(i);
                        File file2 = new File(string);
                        if (file2.exists() && !file2.delete()) {
                            arrayList.add(string);
                        }
                    }
                    if (arrayList.isEmpty()) {
                        callback2.invoke(null, Boolean.TRUE);
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Failed to delete: ");
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            sb.append((String) it.next());
                            sb.append(", ");
                        }
                        callback2.invoke(sb.toString());
                    }
                } catch (Exception e) {
                    callback2.invoke(e.getLocalizedMessage());
                }
                return Integer.valueOf(readableArrayArr[0].size());
            default:
                InterfaceC0214Cm1[] interfaceC0214Cm1Arr = (InterfaceC0214Cm1[]) objArr;
                if (interfaceC0214Cm1Arr != null && interfaceC0214Cm1Arr.length != 0) {
                    try {
                        InterfaceC0214Cm1 interfaceC0214Cm1 = interfaceC0214Cm1Arr[0];
                        String string2 = ((JSONObject) obj).toString();
                        MN0 mn0 = (MN0) interfaceC0214Cm1;
                        mn0.getClass();
                        O90.f(string2, "text");
                        C0674Ik c0674Ik = C0674Ik.d;
                        mn0.i(TE.D(string2), 1);
                    } catch (Exception unused) {
                        AbstractC3393dS.s("InspectorPackagerConnection");
                    }
                }
                return null;
        }
    }
}
