package p000;

import android.view.ActionMode;
import android.view.MenuItem;
import android.webkit.ValueCallback;
import com.facebook.react.bridge.WritableMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: fH0 */
/* loaded from: classes2.dex */
public final class C9349fH0 implements ValueCallback {

    /* renamed from: a */
    public final /* synthetic */ MenuItem f27127a;

    /* renamed from: b */
    public final /* synthetic */ WritableMap f27128b;

    /* renamed from: c */
    public final /* synthetic */ ActionMode f27129c;

    /* renamed from: d */
    public final /* synthetic */ C9477gH0 f27130d;

    public C9349fH0(C9477gH0 c9477gH0, MenuItem menuItem, WritableMap writableMap, ActionMode actionMode) {
        this.f27130d = c9477gH0;
        this.f27127a = menuItem;
        this.f27128b = writableMap;
        this.f27129c = actionMode;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) throws JSONException {
        String string;
        String str = (String) obj;
        C9477gH0 c9477gH0 = this.f27130d;
        Map map = (Map) c9477gH0.f27662b.f29042n.get(this.f27127a.getItemId());
        String str2 = (String) map.get("label");
        WritableMap writableMap = this.f27128b;
        writableMap.putString("label", str2);
        writableMap.putString("key", (String) map.get("key"));
        try {
            string = new JSONObject(str).getString("selection");
        } catch (JSONException unused) {
            string = "";
        }
        writableMap.putString("selectedText", string);
        C9733iH0 c9733iH0 = c9477gH0.f27662b;
        c9733iH0.m18995a(c9733iH0, new C4004ef(C11141tH0.m24864a(c9733iH0), writableMap, 8));
        this.f27129c.finish();
    }
}
