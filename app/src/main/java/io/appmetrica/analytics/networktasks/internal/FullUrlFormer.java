package io.appmetrica.analytics.networktasks.internal;

import android.net.Uri;
import io.appmetrica.analytics.networktasks.impl.C5678c;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class FullUrlFormer<T> {

    /* renamed from: a */
    private List f33113a = new ArrayList();

    /* renamed from: b */
    private int f33114b = -1;

    /* renamed from: c */
    private String f33115c;

    /* renamed from: d */
    private final IParamsAppender f33116d;

    /* renamed from: e */
    private final ConfigProvider f33117e;

    public FullUrlFormer(IParamsAppender<T> iParamsAppender, ConfigProvider<T> configProvider) {
        this.f33116d = iParamsAppender;
        this.f33117e = configProvider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void buildAndSetFullHostUrl() {
        Uri.Builder builderBuildUpon = Uri.parse((String) this.f33113a.get(this.f33114b)).buildUpon();
        this.f33116d.appendParams(builderBuildUpon, this.f33117e.getConfig());
        this.f33115c = builderBuildUpon.build().toString();
    }

    public List<String> getAllHosts() {
        return this.f33113a;
    }

    public String getUrl() {
        return new C5678c(this.f33115c).f33088a;
    }

    public boolean hasMoreHosts() {
        return this.f33114b + 1 < this.f33113a.size();
    }

    public void incrementAttemptNumber() {
        this.f33114b++;
    }

    public void setHosts(List<String> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        this.f33113a = list;
    }
}
