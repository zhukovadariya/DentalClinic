document.addEventListener('DOMContentLoaded', function () {
    let s = document.getElementById('procedure')
    getTimeSlots(s)
})
document.getElementById('procedure').addEventListener('change', function() {
    getTimeSlots(this)
});

function getTimeSlots(s) {
    var id = s.value;
    fetch('/timeSlots?id=' + id)
        .then(response => response.json())
        .then(timeSlots => {
            var timeSlotSelect = document.getElementById('timeSlot');
            timeSlotSelect.innerHTML = '';
            timeSlots.forEach(timeSlot =>

            {
                var option = document.createElement('option');
                option.value = timeSlot.id;
                option.text = timeSlot.freeTime;
                timeSlotSelect.add(option);
            });
        });
}