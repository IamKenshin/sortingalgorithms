# Not the best way to implement quicksort in Ruby, but it works.  It adds a new method to Array.
# Taken from https://rosettacode.org/wiki/Sorting_algorithms/Quicksort#Ruby
class Array
  def quick_sort
    return self if length <= 1
    pivot = self[0]
    less, greatereq = self[1..-1].partition { |x| x < pivot }
    less.quick_sort + [pivot] + greatereq.quick_sort
  end
end

data = [50, 12, 9, 167, 6, 1, 12]


puts data.quick_sort