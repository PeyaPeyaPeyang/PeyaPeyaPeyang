s/\$LAST_COMMIT_DATE\$|${{ github.event.head_commit.timestamp }}/g
s/\$LAST_COMMIT_MESSAGE\$|${{ github.event.head_commit.message }}/g
