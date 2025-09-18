package p000;

import android.content.Context;
import android.content.res.Resources;
import com.p019vk.push.common.HostInfoProvider;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* renamed from: zw */
/* loaded from: classes2.dex */
public final class C7295zw implements HostInfoProvider {

    /* renamed from: a */
    public final /* synthetic */ int f47103a;

    /* renamed from: b */
    public final String f47104b;

    /* renamed from: c */
    public final String f47105c;

    public C7295zw(String str) {
        this.f47103a = 0;
        this.f47104b = String.format("chepusher.%s.rustore.devmail.ru", Arrays.copyOf(new Object[]{str}, 1));
        this.f47105c = "https";
    }

    @Override // com.p019vk.push.common.HostInfoProvider
    public String getHost() {
        return this.f47104b;
    }

    @Override // com.p019vk.push.common.HostInfoProvider
    public Integer getPort() {
        return HostInfoProvider.DefaultImpls.getPort(this);
    }

    @Override // com.p019vk.push.common.HostInfoProvider
    public String getScheme() {
        return this.f47105c;
    }

    public String toString() {
        switch (this.f47103a) {
            case 1:
                StringBuilder sb = new StringBuilder();
                sb.append(this.f47104b);
                sb.append("(");
                return AbstractC1374Vq.m8593l(sb, this.f47105c, ")");
            default:
                return super.toString();
        }
    }

    public C7295zw(C0827N8 c0827n8) throws Resources.NotFoundException, IOException {
        this.f47103a = 2;
        int iM8625j = AbstractC1378Vu.m8625j((Context) c0827n8.f7523b, "com.google.firebase.crashlytics.unity_version", "string");
        Context context = (Context) c0827n8.f7523b;
        if (iM8625j != 0) {
            this.f47104b = "Unity";
            this.f47105c = context.getResources().getString(iM8625j);
            return;
        }
        if (context.getAssets() != null) {
            try {
                InputStream inputStreamOpen = context.getAssets().open("flutter_assets/NOTICES.Z");
                if (inputStreamOpen != null) {
                    inputStreamOpen.close();
                }
                this.f47104b = "Flutter";
                this.f47105c = null;
                return;
            } catch (IOException unused) {
            }
        }
        this.f47104b = null;
        this.f47105c = null;
    }

    public C7295zw(String str, String str2) {
        this.f47103a = 1;
        this.f47104b = str;
        this.f47105c = str2;
    }
}
