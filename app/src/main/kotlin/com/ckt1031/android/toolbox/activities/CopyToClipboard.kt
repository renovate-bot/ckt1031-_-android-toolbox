package com.ckt1031.android.toolbox.activities

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity

class CopyToClipboard : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if ("text/plain" == intent.type) {
            val text = intent.getStringExtra(Intent.EXTRA_TEXT)

            if (text == null) {
                Toast.makeText(this, "No text to copy", Toast.LENGTH_SHORT).show()
                finish()
                return
            }

            val clipboard = getSystemService(CLIPBOARD_SERVICE) as ClipboardManager
            val clip = ClipData.newPlainText("text", text)

            clipboard.setPrimaryClip(clip)

            Toast.makeText(this, "Copied to clipboard", Toast.LENGTH_SHORT).show()
        }

        finish()
    }
}
