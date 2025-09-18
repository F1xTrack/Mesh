package p000;

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
public final class AsyncTaskC9997kL0 extends AsyncTask {

    /* renamed from: a */
    public final /* synthetic */ int f36433a;

    /* renamed from: b */
    public final /* synthetic */ Object f36434b;

    public /* synthetic */ AsyncTaskC9997kL0(int i, Object obj) {
        this.f36433a = i;
        this.f36434b = obj;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        Object obj = this.f36434b;
        switch (this.f36433a) {
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
                                writableArrayCreateArray.pushMap(AbstractC10253mL0.m22807f(file.getPath() + "/" + str));
                            }
                        } else {
                            writableArrayCreateArray.pushMap(AbstractC10253mL0.m22807f(file.getAbsolutePath()));
                        }
                        callback.invoke(null, writableArrayCreateArray);
                    } else {
                        callback.invoke(AbstractC1374Vq.m8593l(new StringBuilder("failed to lstat path `"), strArr[0], "` because it does not exist or it is not a folder"));
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
                InterfaceC7443Cm1[] interfaceC7443Cm1Arr = (InterfaceC7443Cm1[]) objArr;
                if (interfaceC7443Cm1Arr != null && interfaceC7443Cm1Arr.length != 0) {
                    try {
                        InterfaceC7443Cm1 interfaceC7443Cm1 = interfaceC7443Cm1Arr[0];
                        String string2 = ((JSONObject) obj).toString();
                        MN0 mn0 = (MN0) interfaceC7443Cm1;
                        mn0.getClass();
                        O90.m5968f(string2, "text");
                        C0551Ik c0551Ik = C0551Ik.f5116d;
                        mn0.m5357i(C1210TE.m7631D(string2), 1);
                    } catch (Exception unused) {
                        AbstractC3929dS.m17686s("InspectorPackagerConnection");
                    }
                }
                return null;
        }
    }
}
