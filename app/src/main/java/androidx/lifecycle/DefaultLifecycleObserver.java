package androidx.lifecycle;

import kotlin.Metadata;
import p000.InterfaceC7850Ki0;
import p000.InterfaceC7902Li0;

@Metadata(m22266d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u0006J\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, m22267d2 = {"Landroidx/lifecycle/DefaultLifecycleObserver;", "LKi0;", "LLi0;", "owner", "LTf1;", "onCreate", "(LLi0;)V", "onStart", "onResume", "onPause", "onStop", "onDestroy", "lifecycle-common"}, m22268k = 1, m22269mv = {1, 8, 0}, m22271xi = 48)
/* loaded from: classes.dex */
public interface DefaultLifecycleObserver extends InterfaceC7850Ki0 {
    void onCreate(InterfaceC7902Li0 owner);

    void onDestroy(InterfaceC7902Li0 owner);

    void onPause(InterfaceC7902Li0 owner);

    void onResume(InterfaceC7902Li0 owner);

    void onStart(InterfaceC7902Li0 owner);

    void onStop(InterfaceC7902Li0 owner);
}
