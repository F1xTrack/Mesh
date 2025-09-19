package com.proyecto26.inappbrowser;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import p000.C0998Pr;
import p000.C6741rP;

/* loaded from: classes2.dex */
public class ChromeTabsManagerActivity extends Activity {

    /* renamed from: d */
    public static final /* synthetic */ int f20229d = 0;

    /* renamed from: a */
    public boolean f20230a = false;

    /* renamed from: b */
    public String f20231b = null;

    /* renamed from: c */
    public boolean f20232c = false;

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        try {
            super.onCreate(bundle);
            if (!getIntent().hasExtra("browserIntent") || (bundle != null && bundle.getString("browserResultType") != null)) {
                finish();
                return;
            }
            Intent intent = (Intent) getIntent().getParcelableExtra("browserIntent");
            intent.addFlags(67108864);
            startActivity(intent);
            this.f20231b = "dismiss";
        } catch (Exception e) {
            this.f20232c = true;
            C6741rP.m24327b().m24331f(new C0998Pr("Unable to open url.", this.f20231b, Boolean.valueOf(this.f20232c)));
            finish();
            e.printStackTrace();
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        String str = this.f20231b;
        if (str != null) {
            if (str.equals("cancel")) {
                C6741rP.m24327b().m24331f(new C0998Pr("chrome tabs activity closed", this.f20231b, Boolean.valueOf(this.f20232c)));
            } else {
                C6741rP.m24327b().m24331f(new C0998Pr("chrome tabs activity destroyed", "dismiss", Boolean.valueOf(this.f20232c)));
            }
            this.f20231b = null;
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override // android.app.Activity
    public final void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.f20231b = bundle.getString("browserResultType");
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        if (!this.f20230a) {
            this.f20230a = true;
        } else {
            this.f20231b = "cancel";
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putString("browserResultType", "dismiss");
        super.onSaveInstanceState(bundle);
    }
}
