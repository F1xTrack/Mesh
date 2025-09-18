package com.huawei.hms.adapter;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.huawei.hms.activity.BridgeActivity;
import com.huawei.hms.api.BindingFailedResolution;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.Util;

/* loaded from: classes.dex */
public class BinderAdapter implements ServiceConnection {

    /* renamed from: a */
    private final Context f18742a;

    /* renamed from: b */
    private final String f18743b;

    /* renamed from: c */
    private final String f18744c;

    /* renamed from: d */
    private BinderCallBack f18745d;

    /* renamed from: e */
    private IBinder f18746e;

    /* renamed from: f */
    private final Object f18747f = new Object();

    /* renamed from: g */
    private boolean f18748g = false;

    /* renamed from: h */
    private Handler f18749h = null;

    /* renamed from: i */
    private Handler f18750i = null;

    public interface BinderCallBack {
        void onBinderFailed(int i);

        void onBinderFailed(int i, Intent intent);

        void onNullBinding(ComponentName componentName);

        void onServiceConnected(ComponentName componentName, IBinder iBinder);

        void onServiceDisconnected(ComponentName componentName);

        void onTimedDisconnected();
    }

    public BinderAdapter(Context context, String str, String str2) {
        this.f18742a = context;
        this.f18743b = str;
        this.f18744c = str2;
    }

    /* renamed from: c */
    private void m11464c() {
        synchronized (this.f18747f) {
            try {
                Handler handler = this.f18749h;
                if (handler != null) {
                    handler.removeMessages(getConnTimeOut());
                    this.f18749h = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: d */
    private void m11465d() {
        Handler handler = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.huawei.hms.adapter.BinderAdapter.2
            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                if (message == null || message.what != BinderAdapter.this.getMsgDelayDisconnect()) {
                    return false;
                }
                HMSLog.m12622i("BinderAdapter", "The serviceConnection has been bind for 1800s, need to unbind.");
                BinderAdapter.this.unBind();
                BinderCallBack binderCallBackM11467f = BinderAdapter.this.m11467f();
                if (binderCallBackM11467f == null) {
                    return true;
                }
                binderCallBackM11467f.onTimedDisconnected();
                return true;
            }
        });
        this.f18750i = handler;
        handler.sendEmptyMessageDelayed(getMsgDelayDisconnect(), 1800000L);
    }

    /* renamed from: e */
    private void m11466e() {
        HMSLog.m12620e("BinderAdapter", "In connect, bind core service fail");
        try {
            ComponentName componentName = new ComponentName(this.f18742a.getApplicationInfo().packageName, "com.huawei.hms.activity.BridgeActivity");
            Intent intent = new Intent();
            intent.setComponent(componentName);
            intent.putExtra(BridgeActivity.EXTRA_DELEGATE_CLASS_NAME, BindingFailedResolution.class.getName());
            BinderCallBack binderCallBackM11467f = m11467f();
            if (binderCallBackM11467f != null) {
                binderCallBackM11467f.onBinderFailed(-1, intent);
            }
        } catch (RuntimeException e) {
            HMSLog.m12620e("BinderAdapter", "getBindFailPendingIntent failed " + e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public BinderCallBack m11467f() {
        return this.f18745d;
    }

    /* renamed from: g */
    private void m11468g() {
        Handler handler = this.f18749h;
        if (handler != null) {
            handler.removeMessages(getConnTimeOut());
        } else {
            this.f18749h = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.huawei.hms.adapter.BinderAdapter.1
                @Override // android.os.Handler.Callback
                public boolean handleMessage(Message message) {
                    if (message == null || message.what != BinderAdapter.this.getConnTimeOut()) {
                        return false;
                    }
                    HMSLog.m12620e("BinderAdapter", "In connect, bind core service time out");
                    BinderAdapter.this.m11463b();
                    return true;
                }
            });
        }
        this.f18749h.sendEmptyMessageDelayed(getConnTimeOut(), 10000L);
    }

    /* renamed from: h */
    private void m11469h() {
        HMSLog.m12617d("BinderAdapter", "removeDelayDisconnectTask.");
        synchronized (BinderAdapter.class) {
            try {
                Handler handler = this.f18750i;
                if (handler != null) {
                    handler.removeMessages(getMsgDelayDisconnect());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void binder(BinderCallBack binderCallBack) {
        if (binderCallBack == null) {
            return;
        }
        this.f18745d = binderCallBack;
        m11460a();
    }

    public int getConnTimeOut() {
        return 0;
    }

    public int getMsgDelayDisconnect() {
        return 0;
    }

    public String getServiceAction() {
        return this.f18743b;
    }

    public IBinder getServiceBinder() {
        return this.f18746e;
    }

    @Override // android.content.ServiceConnection
    public void onNullBinding(ComponentName componentName) {
        HMSLog.m12620e("BinderAdapter", "Enter onNullBinding, than unBind.");
        if (this.f18748g) {
            this.f18748g = false;
            return;
        }
        unBind();
        m11464c();
        BinderCallBack binderCallBackM11467f = m11467f();
        if (binderCallBackM11467f != null) {
            binderCallBackM11467f.onNullBinding(componentName);
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        HMSLog.m12622i("BinderAdapter", "BinderAdapter Enter onServiceConnected.");
        this.f18746e = iBinder;
        m11464c();
        BinderCallBack binderCallBackM11467f = m11467f();
        if (binderCallBackM11467f != null) {
            binderCallBackM11467f.onServiceConnected(componentName, iBinder);
        }
        m11465d();
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        HMSLog.m12622i("BinderAdapter", "Enter onServiceDisconnected.");
        BinderCallBack binderCallBackM11467f = m11467f();
        if (binderCallBackM11467f != null) {
            binderCallBackM11467f.onServiceDisconnected(componentName);
        }
        m11469h();
    }

    public void unBind() {
        Util.unBindServiceCatchException(this.f18742a, this);
    }

    public void updateDelayTask() {
        HMSLog.m12617d("BinderAdapter", "updateDelayTask.");
        synchronized (BinderAdapter.class) {
            try {
                Handler handler = this.f18750i;
                if (handler != null) {
                    handler.removeMessages(getMsgDelayDisconnect());
                    this.f18750i.sendEmptyMessageDelayed(getMsgDelayDisconnect(), 1800000L);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: a */
    private void m11460a() {
        if (TextUtils.isEmpty(this.f18743b) || TextUtils.isEmpty(this.f18744c)) {
            m11466e();
        }
        Intent intent = new Intent(this.f18743b);
        try {
            intent.setPackage(this.f18744c);
        } catch (IllegalArgumentException unused) {
            HMSLog.m12620e("BinderAdapter", "IllegalArgumentException when bindCoreService intent.setPackage");
            m11466e();
        }
        synchronized (this.f18747f) {
            try {
                if (this.f18742a.bindService(intent, this, 1)) {
                    m11468g();
                } else {
                    this.f18748g = true;
                    m11466e();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m11463b() {
        BinderCallBack binderCallBackM11467f = m11467f();
        if (binderCallBackM11467f != null) {
            binderCallBackM11467f.onBinderFailed(-1);
        }
    }
}
