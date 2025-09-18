package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.vk.push.common.HostInfoProvider;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* renamed from: zw, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8455zw implements HostInfoProvider {
    public final /* synthetic */ int a;
    public final String b;
    public final String c;

    public C8455zw(String str) {
        this.a = 0;
        this.b = String.format("chepusher.%s.rustore.devmail.ru", Arrays.copyOf(new Object[]{str}, 1));
        this.c = "https";
    }

    @Override // com.vk.push.common.HostInfoProvider
    public String getHost() {
        return this.b;
    }

    @Override // com.vk.push.common.HostInfoProvider
    public Integer getPort() {
        return HostInfoProvider.DefaultImpls.getPort(this);
    }

    @Override // com.vk.push.common.HostInfoProvider
    public String getScheme() {
        return this.c;
    }

    public String toString() {
        switch (this.a) {
            case 1:
                StringBuilder sb = new StringBuilder();
                sb.append(this.b);
                sb.append("(");
                return AbstractC1705Vq.l(sb, this.c, ")");
            default:
                return super.toString();
        }
    }

    public C8455zw(N8 n8) throws Resources.NotFoundException, IOException {
        this.a = 2;
        int iJ = AbstractC1717Vu.j((Context) n8.b, "com.google.firebase.crashlytics.unity_version", "string");
        Context context = (Context) n8.b;
        if (iJ != 0) {
            this.b = "Unity";
            this.c = context.getResources().getString(iJ);
            return;
        }
        if (context.getAssets() != null) {
            try {
                InputStream inputStreamOpen = context.getAssets().open("flutter_assets/NOTICES.Z");
                if (inputStreamOpen != null) {
                    inputStreamOpen.close();
                }
                this.b = "Flutter";
                this.c = null;
                return;
            } catch (IOException unused) {
            }
        }
        this.b = null;
        this.c = null;
    }

    public C8455zw(String str, String str2) {
        this.a = 1;
        this.b = str;
        this.c = str2;
    }
}
